import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apta extends ahcz implements aheo
{
    public static final apta a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(apta.class, a = new apta());
    }
    
    private apta() {
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
                if ((b = apta.b) == null) {
                    synchronized (apta.class) {
                        if (apta.b == null) {
                            apta.b = (ahev)new ahcs((ahcz)apta.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apta.a;
            }
            case 4: {
                return new ahcr((ahcz)apta.a);
            }
            case 3: {
                return new apta();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apta.a, "\u0001\u0000", null);
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
