import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcf extends ahcz implements aheo
{
    private static final arcf a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(arcf.class, a = new arcf());
    }
    
    private arcf() {
    }
    
    public static arcf a() {
        return arcf.a;
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
                if ((b = arcf.b) == null) {
                    synchronized (arcf.class) {
                        if (arcf.b == null) {
                            arcf.b = (ahev)new ahcs((ahcz)arcf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arcf.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new arcf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcf.a, "\u0001\u0000", null);
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
