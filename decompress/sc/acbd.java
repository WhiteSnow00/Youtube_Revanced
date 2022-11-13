import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbd extends ahbh implements ahcw
{
    public static final acbd a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public ahab d;
    public ahbx e;
    public ahab f;
    
    static {
        ahbh.registerDefaultInstance((Class)acbd.class, (ahbh)(a = new acbd()));
    }
    
    private acbd() {
        this.c = "";
        this.d = ahab.b;
        this.e = emptyProtobufList();
        this.f = ahab.b;
    }
    
    public final void a() {
        final ahbx e = this.e;
        if (!e.c()) {
            this.e = ahbh.mutableCopy(e);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = acbd.g) == null) {
                    synchronized (acbd.class) {
                        if (acbd.g == null) {
                            acbd.g = (ahdd)new ahba((ahbh)acbd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return acbd.a;
            }
            case 4: {
                return new ahaz((ahbh)acbd.a);
            }
            case 3: {
                return new acbd();
            }
            case 2: {
                return newMessageInfo((MessageLite)acbd.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u001c\u0004\u100a\u0002", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
