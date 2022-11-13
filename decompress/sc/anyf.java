import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anyf extends ahbh implements ahcw
{
    public static final anyf a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)anyf.class, (ahbh)(a = new anyf()));
    }
    
    private anyf() {
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
                if ((b = anyf.b) == null) {
                    synchronized (anyf.class) {
                        if (anyf.b == null) {
                            anyf.b = (ahdd)new ahba((ahbh)anyf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anyf.a;
            }
            case 4: {
                return new ahaz((ahbh)anyf.a);
            }
            case 3: {
                return new anyf();
            }
            case 2: {
                return newMessageInfo((MessageLite)anyf.a, "\u0001\u0000", (Object[])null);
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
