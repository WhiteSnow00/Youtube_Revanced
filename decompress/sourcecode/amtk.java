import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtk extends agzi implements ahax
{
    public static final amtk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amtk.class, a = new amtk());
    }
    
    private amtk() {
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
                if ((b = amtk.b) == null) {
                    synchronized (amtk.class) {
                        if (amtk.b == null) {
                            amtk.b = (ahbe)new agzb((agzi)amtk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amtk.a;
            }
            case 4: {
                return new agza((agzi)amtk.a);
            }
            case 3: {
                return new amtk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtk.a, "\u0001\u0000", null);
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
