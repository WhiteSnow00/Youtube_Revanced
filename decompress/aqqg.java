import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqg extends ahcz implements aheo
{
    public static final aqqg a;
    public static final ahcx b;
    private static volatile ahev z;
    private byte A;
    public int c;
    public int d;
    public CommandOuterClass$Command e;
    public aqjc f;
    public boolean g;
    public boolean h;
    public aqgs i;
    public CommandOuterClass$Command j;
    public int k;
    public int l;
    public int m;
    public int n;
    public aomu o;
    public int p;
    public aovr q;
    public int r;
    public int s;
    public CommandOuterClass$Command t;
    public float u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    
    static {
        final aqqg a2 = new aqqg();
        ahcz.registerDefaultInstance(aqqg.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 217165905, ahgc.k, aqqg.class);
    }
    
    private aqqg() {
        this.A = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte a2 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev z;
                if ((z = aqqg.z) == null) {
                    synchronized (aqqg.class) {
                        if (aqqg.z == null) {
                            aqqg.z = (ahev)new ahcs((ahcz)aqqg.a);
                        }
                    }
                }
                return z;
            }
            case 5: {
                return aqqg.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqg.a);
            }
            case 3: {
                return new aqqg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqg.a, "\u0001\u0016\u0000\u0001\u0002\u001b\u0016\u0000\u0000\u0007\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100c\u0000\u0006\u1007\u0003\u0007\u1409\u0005\b\u1409\u0006\t\u100c\u0007\n\u100c\b\u000b\u1007\u0004\f\u100c\t\r\u100c\f\u000e\u1409\r\u000f\u100c\u000e\u0011\u100c\u0010\u0012\u100c\n\u0014\u1409\u000b\u0015\u1409\u0011\u0016\u1001\u0012\u0018\u1007\u0014\u0019\u1007\u0016\u001a\u100c\u0015\u001b\u100c\u0017", new Object[] { "c", "e", "f", "d", aqnr.g, "g", "i", "j", "k", akig.a(), "l", akhh.a(), "h", "m", akhv.a(), "p", aqdx.r, "q", "r", akgi.i, "s", akgi.j, "n", akif.a(), "o", "t", "u", "v", "x", "w", akgi.g, "y", akgi.f });
            }
            case 1: {
                if (o == null) {
                    a2 = 0;
                }
                this.A = a2;
                return null;
            }
            case 0: {
                return this.A;
            }
        }
    }
}
