import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxl extends agzi implements ahax
{
    public static final apxl a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public aioe d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apxl.class, a = new apxl());
    }
    
    private apxl() {
        this.f = 2;
        this.c = "";
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
                final ahbe e;
                if ((e = apxl.e) == null) {
                    synchronized (apxl.class) {
                        if (apxl.e == null) {
                            apxl.e = (ahbe)new agzb((agzi)apxl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apxl.a;
            }
            case 4: {
                return new agza((agzi)apxl.a);
            }
            case 3: {
                return new apxl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
