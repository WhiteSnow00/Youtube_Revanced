import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzj extends ahcz implements aheo
{
    public static final akzj a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(akzj.class, a = new akzj());
    }
    
    private akzj() {
        this.c = 2;
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
                if ((b = akzj.b) == null) {
                    synchronized (akzj.class) {
                        if (akzj.b == null) {
                            akzj.b = (ahev)new ahcs((ahcz)akzj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akzj.a;
            }
            case 4: {
                return new ahcr((ahcz)akzj.a);
            }
            case 3: {
                return new akzj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzj.a, "\u0001\u0000", null);
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
