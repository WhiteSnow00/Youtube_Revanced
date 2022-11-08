import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailk extends agzi implements ahax
{
    public static final ailk a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(ailk.class, a = new ailk());
    }
    
    private ailk() {
        this.c = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ailk.d) == null) {
                    synchronized (ailk.class) {
                        if (ailk.d == null) {
                            ailk.d = (ahbe)new agzb((agzi)ailk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ailk.a;
            }
            case 4: {
                return new agza((agzi)ailk.a);
            }
            case 3: {
                return new ailk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
