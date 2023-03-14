package podChat.model.useLess;

import podChat.model.BaseOutPut;
import podChat.model.ResultUserInfo;

public class OutPutUserInfo extends BaseOutPut {

    private ResultUserInfo result;

    public ResultUserInfo getResult() {
        return result;
    }

    public void setResult(ResultUserInfo resultUserInfo) {
        this.result = resultUserInfo;
    }
}
