import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aref extends ahcz implements aheo
{
    public static final aref a;
    private static volatile ahev o;
    public int b;
    public int c;
    public Object d;
    public String e;
    public aree f;
    public ajoh g;
    public String h;
    public int i;
    public ardz j;
    public apng k;
    public String l;
    public arec m;
    public arei n;
    
    static {
        ahcz.registerDefaultInstance(aref.class, a = new aref());
    }
    
    private aref() {
        this.c = 0;
        this.e = "";
        this.h = "";
        this.l = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = aref.o) == null) {
                    synchronized (aref.class) {
                        if (aref.o == null) {
                            aref.o = (ahev)new ahcs((ahcz)aref.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aref.a;
            }
            case 4: {
                return new ahcr((ahcz)aref.a);
            }
            case 3: {
                return new aref();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aref.a, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u103c\u0000\u0004\u1009\u0004\u0005\u1008\u0005\u0006\u103c\u0000\u0007\u100c\u0006\t\u1009\u0007\n\u1009\b\u000b\u1008\t\f\u1009\n\r\u1009\u000b", new Object[] { "d", "c", "b", "e", "f", apnf.class, "g", "h", apnk.class, "i", aprh.h, "j", "k", "l", "m", "n" });
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
