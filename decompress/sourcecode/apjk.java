import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjk extends agzi implements ahax
{
    public static final apjk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apjk.class, a = new apjk());
    }
    
    private apjk() {
        emptyIntList();
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
                if ((b = apjk.b) == null) {
                    synchronized (apjk.class) {
                        if (apjk.b == null) {
                            apjk.b = (ahbe)new agzb((agzi)apjk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apjk.a;
            }
            case 4: {
                return new agza((agzi)apjk.a);
            }
            case 3: {
                return new apjk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjk.a, "\u0001\u0000", null);
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
