// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum PerformanceEventType
{
    private static final PerformanceEventType[] $VALUES;
    
    ASYNC_ENTER_HIERARCHY("ASYNC_ENTER_HIERARCHY", 18), 
    ASYNC_ROOT_CREATION("ASYNC_ROOT_CREATION", 17), 
    BEGIN_COMMAND_EXECUTION("BEGIN_COMMAND_EXECUTION", 7), 
    BEGIN_COMPONENT_MATERIALIZATION("BEGIN_COMPONENT_MATERIALIZATION", 3), 
    BEGIN_FIRST_ROOT_MATERIALIZATION("BEGIN_FIRST_ROOT_MATERIALIZATION", 21), 
    BEGIN_FIRST_ROOT_MEASUREMENT("BEGIN_FIRST_ROOT_MEASUREMENT", 19), 
    BEGIN_FIRST_ROOT_PREPARATION("BEGIN_FIRST_ROOT_PREPARATION", 23), 
    BEGIN_JS_COMMAND_EXECUTION("BEGIN_JS_COMMAND_EXECUTION", 25), 
    BEGIN_JS_CONTEXT_INITIALIZATION("BEGIN_JS_CONTEXT_INITIALIZATION", 37), 
    BEGIN_JS_EXECUTION("BEGIN_JS_EXECUTION", 31), 
    BEGIN_JS_FFI_FUNCTION_EXECUTION("BEGIN_JS_FFI_FUNCTION_EXECUTION", 27), 
    BEGIN_JS_FUNCTION_BINDING("BEGIN_JS_FUNCTION_BINDING", 41), 
    BEGIN_JS_FUNCTION_EXECUTION("BEGIN_JS_FUNCTION_EXECUTION", 39), 
    BEGIN_JS_MODULE_LOADING("BEGIN_JS_MODULE_LOADING", 35), 
    BEGIN_JS_MODULE_PROCESSING("BEGIN_JS_MODULE_PROCESSING", 33), 
    BEGIN_JS_SCHEDULING("BEGIN_JS_SCHEDULING", 29), 
    BEGIN_MODEL_SYNTHESIS("BEGIN_MODEL_SYNTHESIS", 1), 
    BEGIN_ROOT_MATERIALIZATION("BEGIN_ROOT_MATERIALIZATION", 13), 
    BEGIN_ROOT_MEASUREMENT("BEGIN_ROOT_MEASUREMENT", 9), 
    BEGIN_ROOT_MOUNTING("BEGIN_ROOT_MOUNTING", 11), 
    BEGIN_ROOT_PREPARATION("BEGIN_ROOT_PREPARATION", 15), 
    BEGIN_TEMPLATE_RESOLUTION("BEGIN_TEMPLATE_RESOLUTION", 5), 
    END_COMMAND_EXECUTION("END_COMMAND_EXECUTION", 8), 
    END_COMPONENT_MATERIALIZATION("END_COMPONENT_MATERIALIZATION", 4), 
    END_FIRST_ROOT_MATERIALIZATION("END_FIRST_ROOT_MATERIALIZATION", 22), 
    END_FIRST_ROOT_MEASUREMENT("END_FIRST_ROOT_MEASUREMENT", 20), 
    END_FIRST_ROOT_PREPARATION("END_FIRST_ROOT_PREPARATION", 24), 
    END_JS_COMMAND_EXECUTION("END_JS_COMMAND_EXECUTION", 26), 
    END_JS_CONTEXT_INITIALIZATION("END_JS_CONTEXT_INITIALIZATION", 38), 
    END_JS_EXECUTION("END_JS_EXECUTION", 32), 
    END_JS_FFI_FUNCTION_EXECUTION("END_JS_FFI_FUNCTION_EXECUTION", 28), 
    END_JS_FUNCTION_BINDING("END_JS_FUNCTION_BINDING", 42), 
    END_JS_FUNCTION_EXECUTION("END_JS_FUNCTION_EXECUTION", 40), 
    END_JS_MODULE_LOADING("END_JS_MODULE_LOADING", 36), 
    END_JS_MODULE_PROCESSING("END_JS_MODULE_PROCESSING", 34), 
    END_JS_SCHEDULING("END_JS_SCHEDULING", 30), 
    END_MODEL_SYNTHESIS("END_MODEL_SYNTHESIS", 2), 
    END_ROOT_MATERIALIZATION("END_ROOT_MATERIALIZATION", 14), 
    END_ROOT_MEASUREMENT("END_ROOT_MEASUREMENT", 10), 
    END_ROOT_MOUNTING("END_ROOT_MOUNTING", 12), 
    END_ROOT_PREPARATION("END_ROOT_PREPARATION", 16), 
    END_TEMPLATE_RESOLUTION("END_TEMPLATE_RESOLUTION", 6), 
    MAX("MAX", 43), 
    UNKNOWN("UNKNOWN", 0);
    
    private static PerformanceEventType[] $values() {
        return new PerformanceEventType[] { PerformanceEventType.UNKNOWN, PerformanceEventType.BEGIN_MODEL_SYNTHESIS, PerformanceEventType.END_MODEL_SYNTHESIS, PerformanceEventType.BEGIN_COMPONENT_MATERIALIZATION, PerformanceEventType.END_COMPONENT_MATERIALIZATION, PerformanceEventType.BEGIN_TEMPLATE_RESOLUTION, PerformanceEventType.END_TEMPLATE_RESOLUTION, PerformanceEventType.BEGIN_COMMAND_EXECUTION, PerformanceEventType.END_COMMAND_EXECUTION, PerformanceEventType.BEGIN_ROOT_MEASUREMENT, PerformanceEventType.END_ROOT_MEASUREMENT, PerformanceEventType.BEGIN_ROOT_MOUNTING, PerformanceEventType.END_ROOT_MOUNTING, PerformanceEventType.BEGIN_ROOT_MATERIALIZATION, PerformanceEventType.END_ROOT_MATERIALIZATION, PerformanceEventType.BEGIN_ROOT_PREPARATION, PerformanceEventType.END_ROOT_PREPARATION, PerformanceEventType.ASYNC_ROOT_CREATION, PerformanceEventType.ASYNC_ENTER_HIERARCHY, PerformanceEventType.BEGIN_FIRST_ROOT_MEASUREMENT, PerformanceEventType.END_FIRST_ROOT_MEASUREMENT, PerformanceEventType.BEGIN_FIRST_ROOT_MATERIALIZATION, PerformanceEventType.END_FIRST_ROOT_MATERIALIZATION, PerformanceEventType.BEGIN_FIRST_ROOT_PREPARATION, PerformanceEventType.END_FIRST_ROOT_PREPARATION, PerformanceEventType.BEGIN_JS_COMMAND_EXECUTION, PerformanceEventType.END_JS_COMMAND_EXECUTION, PerformanceEventType.BEGIN_JS_FFI_FUNCTION_EXECUTION, PerformanceEventType.END_JS_FFI_FUNCTION_EXECUTION, PerformanceEventType.BEGIN_JS_SCHEDULING, PerformanceEventType.END_JS_SCHEDULING, PerformanceEventType.BEGIN_JS_EXECUTION, PerformanceEventType.END_JS_EXECUTION, PerformanceEventType.BEGIN_JS_MODULE_PROCESSING, PerformanceEventType.END_JS_MODULE_PROCESSING, PerformanceEventType.BEGIN_JS_MODULE_LOADING, PerformanceEventType.END_JS_MODULE_LOADING, PerformanceEventType.BEGIN_JS_CONTEXT_INITIALIZATION, PerformanceEventType.END_JS_CONTEXT_INITIALIZATION, PerformanceEventType.BEGIN_JS_FUNCTION_EXECUTION, PerformanceEventType.END_JS_FUNCTION_EXECUTION, PerformanceEventType.BEGIN_JS_FUNCTION_BINDING, PerformanceEventType.END_JS_FUNCTION_BINDING, PerformanceEventType.MAX };
    }
    
    static {
        $VALUES = $values();
    }
    
    private PerformanceEventType(final String s, final int n) {
    }
}
