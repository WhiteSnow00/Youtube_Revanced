import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphl extends ahcz implements aheo
{
    public static final aphl a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aphl.class, a = new aphl());
    }
    
    private aphl() {
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
                if ((b = aphl.b) == null) {
                    synchronized (aphl.class) {
                        if (aphl.b == null) {
                            aphl.b = (ahev)new ahcs((ahcz)aphl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphl.a;
            }
            case 4: {
                return new ahcr((ahcz)aphl.a);
            }
            case 3: {
                return new aphl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphl.a, "\u0001\u0000", null);
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
