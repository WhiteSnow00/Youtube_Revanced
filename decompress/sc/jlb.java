import android.app.AlertDialog$Builder;
import android.app.AlertDialog;
import androidx.preference.Preference;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.b;
import java.util.HashMap;
import java.util.Map;
import android.view.View;
import android.content.Intent;
import com.google.android.apps.youtube.app.ui.inline.spotlight.DefaultSpotlightModeControlsController;
import com.google.android.apps.youtube.app.settings.UpdatePlaybackAreaPreference;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlb implements View$OnClickListener
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public jlb(final UpdatePlaybackAreaPreference b, final cen a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlb(final DefaultSpotlightModeControlsController a, final aokj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jlc a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jle a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jle a, final apqz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jle a, final aprx b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jlf a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jqh a, final aogc b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jri a, final anzv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jrn a, final aekp b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jsw a, final aicz b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jtc b, final Intent a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlb(final jvo b, final Intent a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jlb(final jwk a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jxe a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final jzk a, final ajdw b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jlb(final kdq a, final vcy b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onClick(final View view) {
        final int c = this.c;
        final AlertDialog alertDialog = null;
        switch (c) {
            default: {
                final Object a = this.a;
                final Object b = this.b;
                final aisk a2 = ((kdq)a).a;
                if (a2 != null && (0x2 & a2.b) != 0x0) {
                    aiqj aiqj;
                    if ((aiqj = a2.d) == null) {
                        aiqj = aiqj.a;
                    }
                    ((vcy)b).c(aiqj, (Map)null);
                }
                return;
            }
            case 19: {
                final Object a3 = this.a;
                aiqj aiqj2;
                if ((aiqj2 = ((aokj)this.b).c) == null) {
                    aiqj2 = aiqj.a;
                }
                final DefaultSpotlightModeControlsController defaultSpotlightModeControlsController = (DefaultSpotlightModeControlsController)a3;
                ((vcy)defaultSpotlightModeControlsController.b.a()).a(aiqj2);
                defaultSpotlightModeControlsController.g(139843);
                return;
            }
            case 18: {
                final Object a4 = this.a;
                final Object b2 = this.b;
                final jzk jzk = (jzk)a4;
                final vcy h = jzk.h;
                final ajdw ajdw = (ajdw)b2;
                ajdv ajdv;
                if ((ajdv = ajdw.b) == null) {
                    ajdv = ajdv.a;
                }
                aiqj aiqj3;
                if ((aiqj3 = ajdv.e) == null) {
                    aiqj3 = aiqj.a;
                }
                h.a(aiqj3);
                ajdv ajdv2;
                if ((ajdv2 = ajdw.b) == null) {
                    ajdv2 = ajdv.a;
                }
                if (!ajdv2.g.H()) {
                    final wyw pf = jzk.b.pF();
                    ajdv ajdv3;
                    if ((ajdv3 = ajdw.b) == null) {
                        ajdv3 = ajdv.a;
                    }
                    pf.J(3, (wzz)new wyt(ajdv3.g.I()), (alhi)null);
                }
                return;
            }
            case 17: {
                final HashMap hashMap = new HashMap(2);
                hashMap.put("parent_csn", ((jxe)this.a).b);
                hashMap.put("parent_ve_type", ((jxe)this.a).c);
                ((jxe)this.a).a.c((aiqj)this.b, (Map)hashMap);
                return;
            }
            case 16: {
                final int checkedRadioButtonId = ((jwk)this.a).f.getCheckedRadioButtonId();
                if (checkedRadioButtonId != -1) {
                    final Object tag = ((jwk)this.a).f.findViewById(checkedRadioButtonId).getTag();
                    if (tag instanceof aopi) {
                        final vcy b3 = ((jwk)this.a).b;
                        aiqj aiqj4;
                        if ((aiqj4 = ((aopi)tag).e) == null) {
                            aiqj4 = aiqj.a;
                        }
                        b3.c(aiqj4, (Map)null);
                    }
                    else if (tag instanceof aopd) {
                        final vcy b4 = ((jwk)this.a).b;
                        aiqj aiqj5;
                        if ((aiqj5 = ((aopd)tag).d) == null) {
                            aiqj5 = aiqj.a;
                        }
                        b4.c(aiqj5, (Map)null);
                    }
                    ((jwk)this.a).g.dismiss();
                    final Object b5 = this.b;
                    if (b5 != null) {
                        ((jwk)this.a).c.d((Object)uzo.b(b5));
                    }
                }
                return;
            }
            case 15: {
                ((jvo)this.b).a.startActivity((Intent)this.a);
                return;
            }
            case 14: {
                final Object b6 = this.b;
                final Object a5 = this.a;
                final jvo jvo = (jvo)b6;
                teu.n(jvo.d, jvo.c.b((aezf)jtb.d), (ttg)jqo.i, (ttg)teu.b);
                jvo.a.startActivity((Intent)a5);
                return;
            }
            case 13: {
                ((jtc)this.b).b.startActivity((Intent)this.a);
                return;
            }
            case 12: {
                final Object a6 = this.a;
                final Object b7 = this.b;
                final jsw jsw = (jsw)a6;
                ((fy)jsw.f).dismiss();
                final aicz aicz = (aicz)b7;
                aicz aicz2 = (aicz)b7;
                if ((aicz.b & 0x8000) != 0x0) {
                    aicz2 = (aicz)b7;
                    if (((wyn)jsw.d).e != null) {
                        aiqj aiqj6;
                        if ((aiqj6 = aicz.o) == null) {
                            aiqj6 = aiqj.a;
                        }
                        final ahaz builder = ((ahbh)((ahbc)aiqj6).rx((ahaq)amqf.b)).toBuilder();
                        final String a7 = ((wyn)jsw.d).e.a;
                        builder.copyOnWrite();
                        final amqg amqg = (amqg)builder.instance;
                        a7.getClass();
                        amqg.b |= 0x1;
                        amqg.c = a7;
                        final ahbb ahbb = (ahbb)((ahbh)b7).toBuilder();
                        aiqj aiqj7;
                        if ((aiqj7 = aicz.o) == null) {
                            aiqj7 = aiqj.a;
                        }
                        final ahbb ahbb2 = (ahbb)((ahbh)aiqj7).toBuilder();
                        ahbb2.e((ahaq)amqf.b, (Object)builder.build());
                        ((ahaz)ahbb).copyOnWrite();
                        final aicz aicz3 = (aicz)ahbb.instance;
                        final aiqj o = (aiqj)((ahaz)ahbb2).build();
                        o.getClass();
                        aicz3.o = o;
                        aicz3.b |= 0x8000;
                        aicz2 = (aicz)((ahaz)ahbb).build();
                    }
                }
                final vcy c2 = jsw.c;
                final aicz aicz4 = aicz2;
                aiqj aiqj8;
                if ((aicz4.b & 0x8000) != 0x0) {
                    if ((aiqj8 = aicz4.o) == null) {
                        aiqj8 = aiqj.a;
                    }
                }
                else {
                    aiqj8 = null;
                }
                c2.c(aiqj8, (Map)null);
                return;
            }
            case 11: {
                final Object a8 = this.a;
                final Object b8 = this.b;
                final jrn jrn = (jrn)a8;
                final anzv c3 = jrn.c;
                if (c3 != null) {
                    final aekp aekp = (aekp)b8;
                    if (aekp.D(c3)) {
                        final aoab v = aekp.v(jrn.c);
                        final b b9 = new b(jrn.a, jrn.g, (byte[])null, (byte[])null, (byte[])null);
                        final msn msn = new msn(jrn, v);
                        final View inflate = LayoutInflater.from((Context)b9.a).inflate(2131625360, (ViewGroup)null, false);
                        b9.b = inflate.findViewById(2131428669);
                        final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131432074);
                        b9.c = new TimeRangeView((Context)b9.a);
                        linearLayout.addView((View)b9.c, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
                        final Object b10 = b9.b;
                        b10.getClass();
                        ajut ajut;
                        if ((ajut = v.c) == null) {
                            ajut = ajut.a;
                        }
                        ((TextView)b10).setText((CharSequence)acak.b(ajut));
                        final Object c4 = b9.c;
                        c4.getClass();
                        AlertDialog create;
                        if (!((TimeRangeView)c4).c(v, -1)) {
                            create = alertDialog;
                        }
                        else {
                            final acba al = ((aeea)b9.d).al((Context)b9.a);
                            ((AlertDialog$Builder)al).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setView(inflate).setPositiveButton(2132018939, (DialogInterface$OnClickListener)new fbm(b9, msn, 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                            create = ((AlertDialog$Builder)al).create();
                        }
                        if (create != null) {
                            create.show();
                        }
                    }
                }
                return;
            }
            case 10: {
                final Object a9 = this.a;
                final Object b11 = this.b;
                final jri jri = (jri)a9;
                final boolean checked = jri.e.k() ^ true;
                jri.e.j(checked);
                jri.d.setChecked(checked);
                final vcy b12 = jri.b;
                aiqj aiqj9;
                if (checked) {
                    if ((aiqj9 = ((anzv)b11).i) == null) {
                        aiqj9 = aiqj.a;
                    }
                }
                else if ((aiqj9 = ((anzv)b11).j) == null) {
                    aiqj9 = aiqj.a;
                }
                b12.a(aiqj9);
                return;
            }
            case 9: {
                final Object a10 = this.a;
                final Object b13 = this.b;
                final vcy b14 = ((jqh)a10).b;
                aiqj aiqj10;
                if ((aiqj10 = ((aogc)b13).d) == null) {
                    aiqj10 = aiqj.a;
                }
                b14.a(aiqj10);
                return;
            }
            case 8: {
                ((cen)this.a).b((Preference)this.b);
                return;
            }
            case 7: {
                final Object a11 = this.a;
                final Object b15 = this.b;
                final aiqj f = ((jlf)a11).f;
                if (f != null) {
                    ((vcy)b15).c(f, (Map)null);
                }
                return;
            }
            case 6: {
                final Object b16 = this.b;
                if (b16 != null) {
                    ((jle)this.a).a.c((aiqj)b16, (Map)null);
                }
                return;
            }
            case 5: {
                final apqz apqz = (apqz)this.b;
                if ((apqz.b & 0x8) != 0x0) {
                    final vcy a12 = ((jle)this.a).a;
                    aiqj aiqj11;
                    if ((aiqj11 = apqz.f) == null) {
                        aiqj11 = aiqj.a;
                    }
                    a12.c(aiqj11, (Map)null);
                }
                return;
            }
            case 4: {
                final aprx aprx = (aprx)this.b;
                if ((aprx.b & 0x10) != 0x0) {
                    final vcy a13 = ((jle)this.a).a;
                    aiqj aiqj12;
                    if ((aiqj12 = aprx.g) == null) {
                        aiqj12 = aiqj.a;
                    }
                    a13.c(aiqj12, (Map)null);
                }
                return;
            }
            case 3: {
                ((jle)this.a).a.c((aiqj)this.b, (Map)null);
                return;
            }
            case 2: {
                ((jlc)this.a).a.c((aiqj)this.b, (Map)null);
                return;
            }
            case 1: {
                ((jlc)this.a).a.c((aiqj)this.b, (Map)null);
                return;
            }
            case 0: {
                ((jlc)this.a).a.c((aiqj)this.b, (Map)null);
            }
        }
    }
}
