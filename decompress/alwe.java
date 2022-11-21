import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwe extends ahcz implements aheo
{
    public static final alwe a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(alwe.class, a = new alwe());
    }
    
    private alwe() {
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
                if ((b = alwe.b) == null) {
                    synchronized (alwe.class) {
                        if (alwe.b == null) {
                            alwe.b = (ahev)new ahcs((ahcz)alwe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alwe.a;
            }
            case 4: {
                return new ahcr((ahcz)alwe.a);
            }
            case 3: {
                return new alwe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwe.a, "\u0001\u0000", null);
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
