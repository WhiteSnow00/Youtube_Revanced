import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiet extends ahbh implements ahcw
{
    public static final aiet a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aiet.class, (ahbh)(a = new aiet()));
    }
    
    private aiet() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aiet.b) == null) {
                    synchronized (aiet.class) {
                        if (aiet.b == null) {
                            aiet.b = (ahdd)new ahba((ahbh)aiet.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiet.a;
            }
            case 4: {
                return new ahaz((ahbh)aiet.a);
            }
            case 3: {
                return new aiet();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiet.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                byte c;
                if (o == null) {
                    c = 0;
                }
                else {
                    c = 1;
                }
                this.c = c;
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
