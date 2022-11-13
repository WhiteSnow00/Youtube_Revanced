import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoil extends ahbh implements ahcw
{
    public static final aoil a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        ahbh.registerDefaultInstance((Class)aoil.class, (ahbh)(a = new aoil()));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aoir.a, (Object)false, (MessageLite)null, (ahbm)null, 239610506, ahek.h, (Class)Boolean.class);
    }
    
    private aoil() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aoil.c) == null) {
                    synchronized (aoil.class) {
                        if (aoil.c == null) {
                            aoil.c = (ahdd)new ahba((ahbh)aoil.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoil.a;
            }
            case 4: {
                return new ahaz((ahbh)aoil.a);
            }
            case 3: {
                return new aoil();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoil.a, "\u0001\u0000", (Object[])null);
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
