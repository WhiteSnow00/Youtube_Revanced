import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpk extends ahcz implements aheo
{
    public static final akpk a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(akpk.class, a = new akpk());
    }
    
    private akpk() {
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
                if ((b = akpk.b) == null) {
                    synchronized (akpk.class) {
                        if (akpk.b == null) {
                            akpk.b = (ahev)new ahcs((ahcz)akpk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akpk.a;
            }
            case 4: {
                return new ahcr((ahcz)akpk.a);
            }
            case 3: {
                return new akpk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpk.a, "\u0001\u0000", null);
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
