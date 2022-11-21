import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnp extends ahcz implements aheo
{
    public static final ahnp a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(ahnp.class, a = new ahnp());
    }
    
    private ahnp() {
        this.c = 2;
        emptyProtobufList();
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
                if ((b = ahnp.b) == null) {
                    synchronized (ahnp.class) {
                        if (ahnp.b == null) {
                            ahnp.b = (ahev)new ahcs((ahcz)ahnp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnp.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnp.a);
            }
            case 3: {
                return new ahnp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnp.a, "\u0001\u0000", null);
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
