import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqs extends ahcu implements ahcv
{
    private static volatile ahev F;
    public static final apqs a;
    public apqp A;
    public apqp B;
    public apqp C;
    public apne D;
    public ahbt E;
    private ajws G;
    private ajws H;
    private ajws I;
    private anxb J;
    private ajws K;
    private ajws L;
    private aisc M;
    private ahsx N;
    private almp O;
    private aisc P;
    private anxb Q;
    private apqq R;
    private aisc S;
    private ahjl T;
    private byte U;
    public int b;
    public int c;
    public int d;
    public Object e;
    public String f;
    public aowb g;
    public ajws h;
    public ajws i;
    public ajws j;
    public ajws k;
    public ajws m;
    public ajws n;
    public aisc o;
    public ahdp p;
    public aich q;
    public aich r;
    public aich s;
    public apie t;
    public apqr u;
    public amiy v;
    public boolean w;
    public ahdp x;
    public apqt y;
    public apqp z;
    
    static {
        ahcz.registerDefaultInstance(apqs.class, (ahcz)(a = new apqs()));
    }
    
    private apqs() {
        this.d = 0;
        this.U = 2;
        this.f = "";
        emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.x = emptyProtobufList();
        this.E = ahbt.b;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apqs.F) == null) {
                    synchronized (apqs.class) {
                        if (apqs.F == null) {
                            apqs.F = (ahev)new ahcs((ahcz)apqs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqs.a;
            }
            case 4: {
                return new ahct((ahcu)apqs.a);
            }
            case 3: {
                return new apqs();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqs.a, "\u0001)\u0001\u0002\u00018)\u0000\u0002$\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1409\t\u0006\u1409\u000e\u0007\u1409\u000f\b\u1409\u0010\t\u1409\u0012\n\u041b\r\u1409\u0017\u000f\u1409\f\u0010\u1409+\u0011\u1409\u0019\u0012\u1409\r\u0013\u143c\u0000\u0014\u1409\u001a\u0015\u100a-\u0016\u1409\u0018\u001a\u1409\u0011\u001b\u1007\u001e\u001c\u1409\u001c\u001d\u1409! \u1409\u0015!\u143c\u0000\"\u041b#\u1409\u0014$\u1409\u0016&\u1009\"'\u1409#(\u1409$)\u1409%*\u1409&-\u1009(.\u1409\u001b2\u1409)3\u1409\u001f4\u1409\u00075\u1409\u00046\u1409\u00138\u1409\u0006", new Object[] { "e", "d", "b", "c", "f", "g", "h", "H", "K", "j", "k", "m", "o", "p", aibx.class, "N", "L", "T", "t", "i", aowb.class, "u", "E", "O", "n", "w", "v", "R", "r", ails.class, "x", aovp.class, "q", "s", "y", "z", "A", "B", "C", "D", "P", "S", "Q", "J", "G", "M", "I" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.U = u;
                return null;
            }
            case 0: {
                return this.U;
            }
        }
    }
}
