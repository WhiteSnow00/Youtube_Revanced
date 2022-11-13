import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggw extends ahbh implements ahcw
{
    public static final aggw a;
    private static volatile ahdd f;
    public int b;
    public ahab c;
    public ahbx d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)aggw.class, (ahbh)(a = new aggw()));
    }
    
    private aggw() {
        this.c = ahab.b;
        this.d = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx d = this.d;
        if (!d.c()) {
            this.d = ahbh.mutableCopy(d);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aggw.f) == null) {
                    synchronized (aggw.class) {
                        if (aggw.f == null) {
                            aggw.f = (ahdd)new ahba((ahbh)aggw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aggw.a;
            }
            case 4: {
                return new ahaz((ahbh)aggw.a);
            }
            case 3: {
                return new aggw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aggw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u100a\u0000\u0002\u001c\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
