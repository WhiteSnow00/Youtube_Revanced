import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvy extends ahcz implements aheo
{
    public static final alvy a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(alvy.class, a = new alvy());
    }
    
    private alvy() {
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
                if ((b = alvy.b) == null) {
                    synchronized (alvy.class) {
                        if (alvy.b == null) {
                            alvy.b = (ahev)new ahcs((ahcz)alvy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alvy.a;
            }
            case 4: {
                return new ahcr((ahcz)alvy.a);
            }
            case 3: {
                return new alvy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvy.a, "\u0001\u0000", null);
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
