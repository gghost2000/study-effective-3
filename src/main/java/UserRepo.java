import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UserRepo {

    @Nullable
    public User getNullUser() {
        return null;
    }

    @NotNull
    public User getNotNullUser() {
        return new User();
    }

    public User getUser() {
        return new User();
    }
}
