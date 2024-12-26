package com.wyz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public static<E> Result<E> success(E data){
        return new Result<E>(0, "操作成功", data);
    }

    public static Result success(){
        return new Result(0, "操作成功", null);
    }

    public static Result error(String message){
        return new Result(1, message, null);
    }

//    // 返回包含JSONArray的成功结果
//    public static Result<Object> successWithJsonArray(JSONArray jsonArray) {
//        return new Result<>(0, "操作成功", jsonArray);
//    }

    public static Result<JSONObject> successWithJsonObject(JSONObject jsonObject) {
        return new Result<>(0, "操作成功", jsonObject);
    }

    public static Result<JSONArray> successWithJsonArray(JSONArray jsonArray) {
        return new Result<>(0, "操作成功", jsonArray);
    }
}
