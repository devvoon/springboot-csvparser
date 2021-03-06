package example.kakaopay.domain;

import lombok.Getter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public enum InstitutionCode {
    HUF("주택도시기금","public01"),
    KB("국민은행","bank01"),
    WOORI("우리은행","bank02"),
    SHINHAN("신한은행","bank03"),
    CITY("한국시티은행","bank04"),
    HANA("하나은행","bank05"),
    NH_SH("농협은행/수협은행","bank06"),
    KEB("외환은행","bank07"),
    ETC("기타은행","bank99");

    private final String name;
    private final String code;

    InstitutionCode(String name, String code) {
        this.name = name;
        this.code = code;
    }

    private static final Map<String, String> CODE_MAP = Collections.unmodifiableMap(Stream.of(values()).collect(Collectors.toMap(InstitutionCode::getCode, InstitutionCode::getName)));

    public static InstitutionCode of(final String code){
        return InstitutionCode.valueOf(CODE_MAP.get(code));
    }
}
