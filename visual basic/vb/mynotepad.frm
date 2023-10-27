VERSION 5.00
Object = "{3B7C8863-D78F-101B-B9B5-04021C009402}#1.2#0"; "RICHTX32.OCX"
Object = "{F9043C88-F6F2-101A-A3C9-08002B2F49FB}#1.2#0"; "comdlg32.ocx"
Begin VB.Form GNotepad 
   Caption         =   "Form1"
   ClientHeight    =   6375
   ClientLeft      =   225
   ClientTop       =   870
   ClientWidth     =   10335
   LinkTopic       =   "Form1"
   ScaleHeight     =   6375
   ScaleWidth      =   10335
   StartUpPosition =   3  'Windows Default
   Begin RichTextLib.RichTextBox RTB 
      Height          =   855
      Left            =   4440
      TabIndex        =   1
      Top             =   2760
      Width           =   1455
      _ExtentX        =   2566
      _ExtentY        =   1508
      _Version        =   393217
      TextRTF         =   $"mynotepad.frx":0000
   End
   Begin MSComDlg.CommonDialog cd1 
      Left            =   3480
      Top             =   2520
      _ExtentX        =   847
      _ExtentY        =   847
      _Version        =   393216
   End
   Begin VB.TextBox Text1 
      Height          =   6015
      Left            =   0
      MultiLine       =   -1  'True
      ScrollBars      =   3  'Both
      TabIndex        =   0
      Top             =   0
      Width           =   73356
   End
   Begin VB.Menu mnufile 
      Caption         =   "&File"
      Begin VB.Menu optnew 
         Caption         =   "&New"
         Shortcut        =   ^N
      End
      Begin VB.Menu optnewwindow 
         Caption         =   "&New Window"
         Shortcut        =   +^{F1}
      End
      Begin VB.Menu optopen 
         Caption         =   "&Open"
         Shortcut        =   ^O
      End
      Begin VB.Menu optsave 
         Caption         =   "&Save"
         Shortcut        =   ^S
      End
      Begin VB.Menu optsaveas 
         Caption         =   "&Save As...."
         Shortcut        =   +{F4}
      End
      Begin VB.Menu optpagesetup 
         Caption         =   "Pa&ge setup"
      End
      Begin VB.Menu optprint 
         Caption         =   "&Print"
         Shortcut        =   ^P
      End
      Begin VB.Menu optexit 
         Caption         =   "&Exit"
      End
   End
   Begin VB.Menu mnuedit 
      Caption         =   "&Edit"
      Begin VB.Menu optundo 
         Caption         =   "&Undo"
         Shortcut        =   ^Z
      End
      Begin VB.Menu optcut 
         Caption         =   "&Cut"
         Shortcut        =   ^X
      End
      Begin VB.Menu optpaste 
         Caption         =   "&Paste"
         Shortcut        =   ^V
      End
      Begin VB.Menu optcopy 
         Caption         =   "&Copy"
         Shortcut        =   ^C
      End
      Begin VB.Menu optdelete 
         Caption         =   "&Delete"
         Shortcut        =   {DEL}
      End
      Begin VB.Menu optsearchwithbing 
         Caption         =   "&Serarch with Bing"
         Shortcut        =   ^E
      End
      Begin VB.Menu optfind 
         Caption         =   "&Find"
         Shortcut        =   ^F
      End
      Begin VB.Menu optfindnext 
         Caption         =   "&Find Next"
         Shortcut        =   {F3}
      End
      Begin VB.Menu optfindprevious 
         Caption         =   "&Find Previous"
         Shortcut        =   +{F3}
      End
      Begin VB.Menu optreplace 
         Caption         =   "&Replace"
         Shortcut        =   ^H
      End
      Begin VB.Menu optselectall 
         Caption         =   "&Select All"
         Shortcut        =   ^A
      End
      Begin VB.Menu opttimedate 
         Caption         =   "&Time/Date"
         Shortcut        =   {F5}
      End
      Begin VB.Menu optgoto 
         Caption         =   "&Go To"
         Shortcut        =   ^G
      End
   End
   Begin VB.Menu mnuformat 
      Caption         =   "For&mat"
   End
   Begin VB.Menu optwordwarp 
      Caption         =   "&Word Warp"
      Begin VB.Menu optfont 
         Caption         =   "Fon&t"
         Shortcut        =   ^T
      End
      Begin VB.Menu optcolor 
         Caption         =   "&color"
         Shortcut        =   ^L
      End
   End
   Begin VB.Menu mnuview 
      Caption         =   "&View"
      Begin VB.Menu optzoom 
         Caption         =   "&Zoom"
         Begin VB.Menu optzoomin 
            Caption         =   "&Zoom In"
            Shortcut        =   ^{F5}
         End
         Begin VB.Menu optzoomout 
            Caption         =   "&Zoom out"
            Shortcut        =   ^{F6}
         End
         Begin VB.Menu optdefaultzoom 
            Caption         =   "&Restore Default Zoom"
            Shortcut        =   ^{F4}
         End
      End
      Begin VB.Menu optstatusbar 
         Caption         =   "&status Bar"
      End
   End
   Begin VB.Menu mnuhelp 
      Caption         =   "&Help"
      Begin VB.Menu optviewhelp 
         Caption         =   "&View Help"
      End
      Begin VB.Menu optsendfeedback 
         Caption         =   "&Send Feedback"
      End
      Begin VB.Menu optguddunotepad 
         Caption         =   "&About GUDDU Notepad"
      End
   End
End
Attribute VB_Name = "GNotepad"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub optcolor_Click()
cd1.ShowColor
Text1.BackColor = cd1.Color

End Sub

Private Sub optfont_Click()
'working on dialog box code
'cd1.ShowFont
'Text1.FontBold = cd1.FontBold

'working on rich text box

cd1.Flags = &H3 Or &H100
cd1.ShowFont
RTB.SelBold = cd1.Bold
RTB.SelUnderline = cd1.Underline
RTB.selsize = cd1.Size
RTB.setcolor = cd1.Color








End Sub

Private Sub optopen_Click()
cd1.ShowOpen
Dim op As Integer
op = cd1.FileName
Form1.Caption = op
Text1.Text = op

   
   

End Sub

Private Sub RichTextBox1_Change()

End Sub

