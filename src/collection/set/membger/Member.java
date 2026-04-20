package collection.set.membger;

import java.util.Objects;

public class Member {

    private String id;//id가 같다면 같다 equals 그리고 hashcode도

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);//이걸 기반으로 hashcode 없으면 참조값사용(object기반)
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
