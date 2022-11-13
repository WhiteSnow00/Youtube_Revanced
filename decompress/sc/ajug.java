import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajug extends ahbh implements ahcw
{
    public static final ajug a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajug.class, (ahbh)(a = new ajug()));
    }
    
    private ajug() {
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
                if ((b = ajug.b) == null) {
                    synchronized (ajug.class) {
                        if (ajug.b == null) {
                            ajug.b = (ahdd)new ahba((ahbh)ajug.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajug.a;
            }
            case 4: {
                return new ahaz((ahbh)ajug.a);
            }
            case 3: {
                return new ajug();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajug.a, "\u0001\u0000", (Object[])null);
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
