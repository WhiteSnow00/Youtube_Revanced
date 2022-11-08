import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvk extends agzi implements ahax
{
    public static final amvk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amvk.class, a = new amvk());
    }
    
    private amvk() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = amvk.b) == null) {
                    synchronized (amvk.class) {
                        if (amvk.b == null) {
                            amvk.b = (ahbe)new agzb((agzi)amvk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amvk.a;
            }
            case 4: {
                return new agza((agzi)amvk.a);
            }
            case 3: {
                return new amvk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvk.a, "\u0001\u0000", null);
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
