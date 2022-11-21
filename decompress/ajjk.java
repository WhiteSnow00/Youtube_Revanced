import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjk extends ahcz implements aheo
{
    public static final ajjk a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(ajjk.class, a = new ajjk());
    }
    
    private ajjk() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = ajjk.d) == null) {
                    synchronized (ajjk.class) {
                        if (ajjk.d == null) {
                            ajjk.d = (ahev)new ahcs((ahcz)ajjk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajjk.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjk.a);
            }
            case 3: {
                return new ajjk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
