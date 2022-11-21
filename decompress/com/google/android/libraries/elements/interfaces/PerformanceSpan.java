// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class PerformanceSpan
{
    final Long begin;
    final int beginThreadIdentifier;
    final Long end;
    final int endThreadIdentifier;
    final PerformanceEventInfo info;
    final boolean isMainThread;
    final int nonce;
    final Integer parentNonce;
    final PerformanceSpanType type;
    
    public PerformanceSpan(final PerformanceSpanType type, final int nonce, final PerformanceEventInfo info, final Long begin, final Long end, final int beginThreadIdentifier, final int endThreadIdentifier, final boolean isMainThread, final Integer parentNonce) {
        this.type = type;
        this.nonce = nonce;
        this.info = info;
        this.begin = begin;
        this.end = end;
        this.beginThreadIdentifier = beginThreadIdentifier;
        this.endThreadIdentifier = endThreadIdentifier;
        this.isMainThread = isMainThread;
        this.parentNonce = parentNonce;
    }
    
    public Long getBegin() {
        return this.begin;
    }
    
    public int getBeginThreadIdentifier() {
        return this.beginThreadIdentifier;
    }
    
    public Long getEnd() {
        return this.end;
    }
    
    public int getEndThreadIdentifier() {
        return this.endThreadIdentifier;
    }
    
    public PerformanceEventInfo getInfo() {
        return this.info;
    }
    
    public boolean getIsMainThread() {
        return this.isMainThread;
    }
    
    public int getNonce() {
        return this.nonce;
    }
    
    public Integer getParentNonce() {
        return this.parentNonce;
    }
    
    public PerformanceSpanType getType() {
        return this.type;
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.type);
        final int nonce = this.nonce;
        final String value2 = String.valueOf(this.info);
        final Long begin = this.begin;
        final Long end = this.end;
        final int beginThreadIdentifier = this.beginThreadIdentifier;
        final int endThreadIdentifier = this.endThreadIdentifier;
        final boolean isMainThread = this.isMainThread;
        final Integer parentNonce = this.parentNonce;
        final StringBuilder sb = new StringBuilder("PerformanceSpan{type=");
        sb.append(value);
        sb.append(",nonce=");
        sb.append(nonce);
        sb.append(",info=");
        sb.append(value2);
        sb.append(",begin=");
        sb.append(begin);
        sb.append(",end=");
        sb.append(end);
        sb.append(",beginThreadIdentifier=");
        sb.append(beginThreadIdentifier);
        sb.append(",endThreadIdentifier=");
        sb.append(endThreadIdentifier);
        sb.append(",isMainThread=");
        sb.append(isMainThread);
        sb.append(",parentNonce=");
        sb.append(parentNonce);
        sb.append("}");
        return sb.toString();
    }
}
