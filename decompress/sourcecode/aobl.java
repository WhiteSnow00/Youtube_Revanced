import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobl extends agzi implements ahax
{
    public static final aobl a;
    private static volatile ahbe b;
    private int c;
    private aokb d;
    private aibb e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aobl.class, a = new aobl());
    }
    
    private aobl() {
        this.f = 2;
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
                final ahbe b2;
                if ((b2 = aobl.b) == null) {
                    synchronized (aobl.class) {
                        if (aobl.b == null) {
                            aobl.b = (ahbe)new agzb((agzi)aobl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aobl.a;
            }
            case 4: {
                return new agza((agzi)aobl.a);
            }
            case 3: {
                return new aobl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobl.a, "\u0001\u0002\u0000\u0001\ue2d9\u1a6d\ueb11\u1f11\u0002\u0000\u0000\u0002\ue2d9\u1a6d\u1409\u0000\ueb11\u1f11\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}