import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoek extends agzi implements ahax
{
    public static final aoek a;
    public static final agzg b;
    private static volatile ahbe d;
    public anss c;
    private int e;
    private ajsq f;
    private byte g;
    
    static {
        final aoek a2 = new aoek();
        agzi.registerDefaultInstance(aoek.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 387380578, ahcm.k, aoek.class);
    }
    
    private aoek() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aoek.d) == null) {
                    synchronized (aoek.class) {
                        if (aoek.d == null) {
                            aoek.d = (ahbe)new agzb((agzi)aoek.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoek.a;
            }
            case 4: {
                return new agza((agzi)aoek.a);
            }
            case 3: {
                return new aoek();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoek.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
