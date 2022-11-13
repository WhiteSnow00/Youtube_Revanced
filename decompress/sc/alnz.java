import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnz extends ahbh implements ahcw
{
    public static final alnz a;
    public static final ahbf b;
    public static final ahbf c;
    private static volatile ahdd d;
    
    static {
        ahbh.registerDefaultInstance((Class)alnz.class, (ahbh)(a = new alnz()));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aloa.a, (Object)false, (MessageLite)null, (ahbm)null, 116410864, ahek.h, (Class)Boolean.class);
        c = ahbh.newSingularGeneratedExtension((MessageLite)aloa.a, (Object)alog.a, (MessageLite)null, alog.d, 116390062, ahek.n, (Class)alog.class);
    }
    
    private alnz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alnz.d) == null) {
                    synchronized (alnz.class) {
                        if (alnz.d == null) {
                            alnz.d = (ahdd)new ahba((ahbh)alnz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alnz.a;
            }
            case 4: {
                return new ahaz((ahbh)alnz.a);
            }
            case 3: {
                return new alnz();
            }
            case 2: {
                return newMessageInfo((MessageLite)alnz.a, "\u0001\u0000", (Object[])null);
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
