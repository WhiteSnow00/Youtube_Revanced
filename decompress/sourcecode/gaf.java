// 
// Decompiled by Procyon v0.6.0
// 

final class gaf extends gbz
{
    private final boolean a;
    
    public gaf(final boolean a) {
        this.a = a;
    }
    
    @Override
    public boolean a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof gbz && this.a == ((gbz)o).a());
    }
    
    @Override
    public int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return n ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder("FreeTextSurveyFocusedEvent{wasFreeTextSurveyFocused=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
