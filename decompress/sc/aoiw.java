import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiw extends ahbh implements ahcw
{
    public static final aoiw a;
    private static volatile ahdd k;
    public int b;
    public int c;
    public Object d;
    public String e;
    public String f;
    public boolean g;
    public akdi h;
    public boolean i;
    public ahab j;
    private anuv l;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)aoiw.class, (ahbh)(a = new aoiw()));
    }
    
    private aoiw() {
        this.c = 0;
        this.n = 2;
        this.e = "";
        this.f = "";
        this.j = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = aoiw.k) == null) {
                    synchronized (aoiw.class) {
                        if (aoiw.k == null) {
                            aoiw.k = (ahdd)new ahba((ahbh)aoiw.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aoiw.a;
            }
            case 4: {
                return new ahaz((ahbh)aoiw.a);
            }
            case 3: {
                return new aoiw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoiw.a, "\u0001\u000b\u0001\u0001\u0001\u000f\u000b\u0000\u0000\u0006\u0001\u1008\u0000\u0002\u1007\u0002\u0003\u143c\u0000\u0004\u1409\b\u0005\u143c\u0000\u0006\u143c\u0000\b\u1008\u0001\t\u1409\n\r\u100a\r\u000e\u1409\u000e\u000f\u1007\f", new Object[] { "d", "c", "b", "e", "g", aoiy.class, "h", aiqj.class, aiqj.class, "f", "l", "j", "m", "i" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
