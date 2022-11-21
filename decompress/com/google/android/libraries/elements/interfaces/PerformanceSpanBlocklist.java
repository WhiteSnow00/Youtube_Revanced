// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum PerformanceSpanBlocklist
{
    private static final PerformanceSpanBlocklist[] $VALUES;
    
    ALL_JAVASCRIPT("ALL_JAVASCRIPT", 13), 
    ASYNC_CREATE_CELL("ASYNC_CREATE_CELL", 8), 
    ASYNC_ENTER_HIERARCHY("ASYNC_ENTER_HIERARCHY", 9), 
    CELL_MATERIALIZATION("CELL_MATERIALIZATION", 6), 
    CELL_MEASUREMENT("CELL_MEASUREMENT", 4), 
    CELL_MOUNTING("CELL_MOUNTING", 5), 
    CELL_PREPARATION("CELL_PREPARATION", 7), 
    COMMAND_EXECUTION("COMMAND_EXECUTION", 3), 
    COMPONENT_MATERIALIZATION("COMPONENT_MATERIALIZATION", 1), 
    FIRST_ROOT_MATERIALIZATION("FIRST_ROOT_MATERIALIZATION", 11), 
    FIRST_ROOT_MEASUREMENT("FIRST_ROOT_MEASUREMENT", 10), 
    FIRST_ROOT_PREPARATION("FIRST_ROOT_PREPARATION", 12), 
    MODEL_SYNTHESIS("MODEL_SYNTHESIS", 0), 
    NATIVE_LIB_CHECKING("NATIVE_LIB_CHECKING", 15), 
    NATIVE_LIB_LOADING("NATIVE_LIB_LOADING", 16), 
    PB_TO_FB("PB_TO_FB", 14), 
    TEMPLATE_FETCHING("TEMPLATE_FETCHING", 17), 
    TEMPLATE_RESOLUTION("TEMPLATE_RESOLUTION", 2);
    
    private static PerformanceSpanBlocklist[] $values() {
        return new PerformanceSpanBlocklist[] { PerformanceSpanBlocklist.MODEL_SYNTHESIS, PerformanceSpanBlocklist.COMPONENT_MATERIALIZATION, PerformanceSpanBlocklist.TEMPLATE_RESOLUTION, PerformanceSpanBlocklist.COMMAND_EXECUTION, PerformanceSpanBlocklist.CELL_MEASUREMENT, PerformanceSpanBlocklist.CELL_MOUNTING, PerformanceSpanBlocklist.CELL_MATERIALIZATION, PerformanceSpanBlocklist.CELL_PREPARATION, PerformanceSpanBlocklist.ASYNC_CREATE_CELL, PerformanceSpanBlocklist.ASYNC_ENTER_HIERARCHY, PerformanceSpanBlocklist.FIRST_ROOT_MEASUREMENT, PerformanceSpanBlocklist.FIRST_ROOT_MATERIALIZATION, PerformanceSpanBlocklist.FIRST_ROOT_PREPARATION, PerformanceSpanBlocklist.ALL_JAVASCRIPT, PerformanceSpanBlocklist.PB_TO_FB, PerformanceSpanBlocklist.NATIVE_LIB_CHECKING, PerformanceSpanBlocklist.NATIVE_LIB_LOADING, PerformanceSpanBlocklist.TEMPLATE_FETCHING };
    }
    
    static {
        $VALUES = $values();
    }
    
    private PerformanceSpanBlocklist(final String s, final int n) {
    }
}
