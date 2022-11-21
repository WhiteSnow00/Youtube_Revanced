// 
// Decompiled by Procyon v0.6.0
// 

public enum ablc
{
    a("DEFAULT", 0, 0), 
    b("MINIMIZED", 1, 1), 
    c("FULLSCREEN", 2, 2), 
    d("BACKGROUND", 3, 3), 
    e("INLINE_IN_FEED", 4, 5), 
    f("VIRTUAL_REALITY", 5, 6), 
    g("PICTURE_IN_PICTURE", 6, 7), 
    h("REMOTE", 7, -1);
    
    private static final ablc[] j;
    public final int i;
    
    private ablc(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public final String a() {
        return String.valueOf(this.i);
    }
    
    public final boolean b() {
        final int ordinal = this.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 4 || ordinal == 5 || ordinal == 6;
    }
}
