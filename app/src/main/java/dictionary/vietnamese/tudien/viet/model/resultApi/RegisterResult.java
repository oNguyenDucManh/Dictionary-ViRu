package dictionary.vietnamese.tudien.viet.model.resultApi;

/**
 * Created by manhi on 1/3/2016.
 */
public class RegisterResult extends BaseResult {
    public RegisterData data;

    public static class RegisterData {
        public String message;
        public UserInfo info;
    }

}