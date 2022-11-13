import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqui extends ahbh implements ahcw
{
    public static final aqui a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqui.class, (ahbh)(a = new aqui()));
    }
    
    private aqui() {
        this.c = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqui.b) == null) {
                    synchronized (aqui.class) {
                        if (aqui.b == null) {
                            aqui.b = (ahdd)new ahba((ahbh)aqui.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqui.a;
            }
            case 4: {
                return new ahaz((ahbh)aqui.a);
            }
            case 3: {
                return new aqui();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqui.a, "\u0001\u0000", (Object[])null);
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
