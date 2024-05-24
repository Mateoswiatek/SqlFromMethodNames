package org.example.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AggregateFunctionMapper {
    private static final Map<String, String> SQL_AGGREGATE_FUNCTION_MAP = new HashMap<>();

    static {
        SQL_AGGREGATE_FUNCTION_MAP.put("Count", "COUNT(");
        SQL_AGGREGATE_FUNCTION_MAP.put("Sum", "SUM(");
        SQL_AGGREGATE_FUNCTION_MAP.put("Avg", "AVG(");
        SQL_AGGREGATE_FUNCTION_MAP.put("Min", "MIN(");
        SQL_AGGREGATE_FUNCTION_MAP.put("Max", "MAX(");
    }

    public static String getSqlStart(String aggregationName) {
        return SQL_AGGREGATE_FUNCTION_MAP.getOrDefault(aggregationName, "");
    }
}