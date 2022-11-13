import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoim extends ahbh implements ahcw
{
    public static final aoim a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aoim.class, (ahbh)(a = new aoim()));
    }
    
    private aoim() {
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
                if ((b = aoim.b) == null) {
                    synchronized (aoim.class) {
                        if (aoim.b == null) {
                            aoim.b = (ahdd)new ahba((ahbh)aoim.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoim.a;
            }
            case 4: {
                return new ahaz((ahbh)aoim.a);
            }
            case 3: {
                return new aoim();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoim.a, "\u0001\u0000", (Object[])null);
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
