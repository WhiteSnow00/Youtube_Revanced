// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum LineBreakMode
{
    private static final LineBreakMode[] $VALUES;
    
    LINE_BREAK_MODE_BY_TRUNCATING_HEAD("LINE_BREAK_MODE_BY_TRUNCATING_HEAD", 2), 
    LINE_BREAK_MODE_BY_TRUNCATING_MIDDLE("LINE_BREAK_MODE_BY_TRUNCATING_MIDDLE", 4), 
    LINE_BREAK_MODE_BY_TRUNCATING_TAIL("LINE_BREAK_MODE_BY_TRUNCATING_TAIL", 3), 
    LINE_BREAK_MODE_BY_WORD_WRAPPING("LINE_BREAK_MODE_BY_WORD_WRAPPING", 1), 
    LINE_BREAK_MODE_TRUNCATE_BY_CLIPPING("LINE_BREAK_MODE_TRUNCATE_BY_CLIPPING", 5), 
    LINE_BREAK_MODE_UNKNOWN("LINE_BREAK_MODE_UNKNOWN", 0);
    
    private static LineBreakMode[] $values() {
        return new LineBreakMode[] { LineBreakMode.LINE_BREAK_MODE_UNKNOWN, LineBreakMode.LINE_BREAK_MODE_BY_WORD_WRAPPING, LineBreakMode.LINE_BREAK_MODE_BY_TRUNCATING_HEAD, LineBreakMode.LINE_BREAK_MODE_BY_TRUNCATING_TAIL, LineBreakMode.LINE_BREAK_MODE_BY_TRUNCATING_MIDDLE, LineBreakMode.LINE_BREAK_MODE_TRUNCATE_BY_CLIPPING };
    }
    
    static {
        $VALUES = $values();
    }
    
    private LineBreakMode(final String s, final int n) {
    }
}
