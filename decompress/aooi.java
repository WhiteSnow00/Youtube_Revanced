import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooi extends ahcz implements aheo
{
    public static final aooi a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aooi.class, a = new aooi());
    }
    
    private aooi() {
        this.c = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aooi.b) == null) {
                    synchronized (aooi.class) {
                        if (aooi.b == null) {
                            aooi.b = (ahev)new ahcs((ahcz)aooi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aooi.a;
            }
            case 4: {
                return new ahcr((ahcz)aooi.a);
            }
            case 3: {
                return new aooi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aooi.a, "\u0001\u0000", null);
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
