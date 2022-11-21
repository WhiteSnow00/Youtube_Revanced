import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmk extends ahcz implements aheo
{
    public static final ajmk a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ajmk.class, a = new ajmk());
    }
    
    private ajmk() {
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
                if ((b = ajmk.b) == null) {
                    synchronized (ajmk.class) {
                        if (ajmk.b == null) {
                            ajmk.b = (ahev)new ahcs((ahcz)ajmk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajmk.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmk.a);
            }
            case 3: {
                return new ajmk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmk.a, "\u0001\u0000", null);
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
