import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzd extends ahbh implements ahcw
{
    public static final aqzd a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public Object d;
    public int e;
    public ahbx f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzd.class, (ahbh)(a = new aqzd()));
    }
    
    private aqzd() {
        this.c = 0;
        this.f = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx f = this.f;
        if (!f.c()) {
            this.f = ahbh.mutableCopy(f);
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
                if ((g = aqzd.g) == null) {
                    synchronized (aqzd.class) {
                        if (aqzd.g == null) {
                            aqzd.g = (ahdd)new ahba((ahbh)aqzd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqzd.a;
            }
            case 4: {
                return new ahaz((boolean[])null, (int[])null);
            }
            case 3: {
                return new aqzd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzd.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u103c\u0000\u0003\u001b\u0004\u103c\u0000", new Object[] { "d", "c", "b", "e", aqvs.n, aqza.class, "f", aqzb.class, aqzc.class });
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
