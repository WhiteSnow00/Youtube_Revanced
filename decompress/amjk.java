import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjk extends ahcz implements aheo
{
    public static final amjk a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(amjk.class, a = new amjk());
    }
    
    private amjk() {
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
                if ((b = amjk.b) == null) {
                    synchronized (amjk.class) {
                        if (amjk.b == null) {
                            amjk.b = (ahev)new ahcs((ahcz)amjk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjk.a;
            }
            case 4: {
                return new ahcr((ahcz)amjk.a);
            }
            case 3: {
                return new amjk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjk.a, "\u0001\u0000", null);
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
