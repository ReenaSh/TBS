#include <IE.au3>
; Internet Explorer is partly integrated in shell.application
$oShell = ObjCreate("shell.application") ; Get the Windows Shell Object
$oShellWindows=$oShell.windows   ; Get the collection of open shell Windows
$MyIExplorer=""
for $Window in $oShellWindows    ; Count all existing shell windows
  ; Note: Internet Explorer appends a slash to the URL in it's window name
  if StringInStr($Window.LocationURL,"http://") then
      $MyIExplorer=$Window
      exitloop
  endif
next
$oForm = _IEGetObjByName ($MyIExplorer, "UploadedFile")
_IEAction($oForm, "click")
WinActivate("Open");
Local $file = "D:\TotalBS\data\2.xlsx"
ControlSetText("Open", "", "Edit1", $file )
ControlClick("Open", "", "Button2")
