import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoea extends agzi implements ahax
{
    public static final aoea a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public aioe d;
    public aioe e;
    public String f;
    public aodz g;
    private byte i;
    
    static {
        final aoea a2 = new aoea();
        agzi.registerDefaultInstance(aoea.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 410400906, ahcm.k, aoea.class);
    }
    
    private aoea() {
        this.i = 2;
        this.f = "";
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
                final ahbe h;
                if ((h = aoea.h) == null) {
                    synchronized (aoea.class) {
                        if (aoea.h == null) {
                            aoea.h = (ahbe)new agzb((agzi)aoea.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoea.a;
            }
            case 4: {
                return new agza((agzi)aoea.a);
            }
            case 3: {
                return new aoea();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoea.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
