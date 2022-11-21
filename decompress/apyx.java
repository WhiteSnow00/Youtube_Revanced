import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyx extends ahcz implements aheo
{
    public static final apyx a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(apyx.class, a = new apyx());
    }
    
    private apyx() {
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apyx.e) == null) {
                    synchronized (apyx.class) {
                        if (apyx.e == null) {
                            apyx.e = (ahev)new ahcs((ahcz)apyx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apyx.a;
            }
            case 4: {
                return new ahcr((ahcz)apyx.a);
            }
            case 3: {
                return new apyx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyx.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0003\u100c\u0002", new Object[] { "b", "c", "d", apvm.m });
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
