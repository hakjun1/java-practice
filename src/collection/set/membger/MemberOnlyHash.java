package collection.set.membger;

import java.util.Objects;

public class MemberOnlyHash {

    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }
    //hashCode만 있고 equals를 구현 하지 않은 경우
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
