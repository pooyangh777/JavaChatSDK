package model.useLess;

import model.BaseOutPut;

public class OutPutThreads<T> extends BaseOutPut {

    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
