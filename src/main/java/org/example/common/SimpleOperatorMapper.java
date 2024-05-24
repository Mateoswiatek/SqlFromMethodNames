package org.example.common;

import java.util.HashMap;
import java.util.Map;

public class SimpleOperatorMapper {

    private static final Map<String, String> SQL_OPERATOR_MAP = new HashMap<>();

    static {
        SQL_OPERATOR_MAP.put("Equals", "== ");
        SQL_OPERATOR_MAP.put("LessThan", "< ");
        SQL_OPERATOR_MAP.put("GreaterThan", "> ");
        SQL_OPERATOR_MAP.put("Between", "BETWEEN ");
    }

    public static String getSqlStart(String aggregationName) {
        return SQL_OPERATOR_MAP.getOrDefault(aggregationName, "");
    }
}
